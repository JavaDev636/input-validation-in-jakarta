package io.ontablab;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Date;

class ValidationUtil {
    private static final String IPV4_REGEX =
            "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    private static final Pattern IPV4_PATTERN = Pattern.compile(IPV4_REGEX);

    public static boolean isValid(TrafficLog trafficLog) {
        if (isValidPort(trafficLog.getPort())) {
            if (isValidIPv4(trafficLog.getSourceIP()) && isValidIPv4(trafficLog.getDestinationIP())) {
                if (isValidDateFormat(trafficLog.getDate()))
                    return true;
                return false;
            } else
                return false;
        }
        return false;
    }

    public static boolean isValidPort(int port) {
        return port >= 0 && port <= 65535;
    }

    public static boolean isValidIPv4(String ip) {
        Matcher matcher = IPV4_PATTERN.matcher(ip);
        return matcher.matches();
    }

    public static boolean isValidDateFormat(Date date) {
        System.out.println(date);
        if (date == null) {
            return false;
        }
        try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
            Date parsedDate = dateFormat.parse(formattedDate);
            if (parsedDate.equals(date)) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }

        return false;
    }
}