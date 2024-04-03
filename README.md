# Sample contribution request for the topic "Input Validation in Java Jakarta"

* Welcome to this repository! :slightly_smiling_face: Before explaining its content, we wanted to thank you for showing interest in collaborating with our secure code training academy [tablab.io][1].

## What are you going to find here?

* You will find the skeleton to create the sample of contribution content requested in our hiring process as Java Security Content Creator.
* Some parts are still incomplete, you will find more information about what's missing below.

## What is the structure of this repository?

* To answer this question, we recommend you to see the repository [sample-contribution-content][2], which represents a real contribution, and its `README.md` file explains the organization of files and directories.

## What should you do with this repository?

* Create a private fork of this repository. Share it only to the Github users [Ferran][3] and [Lluís][4].
* Add content to your new private repository in order to finish this contribution on Input Validation.
* Once you consider that all content was added, **reply back to the email you received from us** so we can proceed to evaluate your fantastic work done. Afterwards, we will contact you.

## How should this contribution be finished/completed?

* There are mainly two sections that are still incomplete:
  * The `en/README.md` file. In this case, since the topic is "Input Validation in Java Jakarta" this file should contain in-depth technical content about the following three points:
    * What is Input Validation?
    * What can be achieved with Input Validation as a security measure?
    * Explain the existing types of input validation. Please focus only on Normalizing Input to UTF-8, Syntax Validation, Regular Expression Validation, and Allow-List Validation.
  * You can find a simple Java Jakarta web application in the `docker` folder that needs input validation to be secure. You should modify the code to implement an Input Validation strategy according to the needs of the application. The `docker` folder contains its own `README.md` with more information.
    * Make sure you don't implement another technique to query the database, such as prepared statements. Just add an input validation strategy in the current code.

## Should you respect any writing format?

* Yes, please refer to the repository [sample-contribution-content][2] where you will find an example and more information about this.
  * Basically, note the writing style by using bulleted lists with short, specific sentences. This is the writing format we want to use to explain content.

## Will you be financially compensated for this contribution?

* Sorry, this contribution will only be used to evaluate your skills, since it will be also implemented by other selected candidates.
* However, if we like your work, we will use this contribution to negotiate with you the financial reward from now on for future contributions (from $40 to $70, with potential for growth over time).
* Please note that in future contributions all code, as the simple Java Jakarta web application in this case, will have to be implemented by yourself.

## Important considerations

* Nowadays, it is relatively easy to find information about Input Validation on Internet. The mission we have at [tablab.io][1] is not to provide just more information about this, but to provide the best content, and also including practical and training exercices. This involves:
  * Going in depth into the topic, with exhaustive analysis when it comes to explaining any concept.
  * Copyright of any information must be respected, sentences or text cannot be copied from other sites.
  * AI technologies can help you, but they may not give you exactly what we are looking for.
* The audience that will read the content and learn from it are other software developers, which allows you the use of technical words.

[1]: https://tablab.io
[2]: https://github.com/samus-io/sample-contribution-content
[3]: https://github.com/ferranverdes
[4]: https://github.com/Howl222

 ## Input Validation Discussed below: 
* What is Input Validation?
Input validation is a crucial process in software development that involves examining and verifying user-provided or external data to ensure it meets specific criteria or standards before processing. Here's a breakdown of what input validation entails:
		Examination of Data: Input validation begins with the examination of data received from users or external sources, such as web forms, APIs, or file uploads.
		Verification of Format: It verifies that the input data conforms to the expected format, structure, or syntax. This includes checking for correct data types, lengths, and patterns.
		Detection of Errors: Input validation identifies and detects errors or discrepancies in the input data, such as missing fields, invalid characters, or data that exceeds predefined limits.
		Prevention of Security Threats: One of the primary goals of input validation is to prevent security threats such as injection attacks (e.g., SQL injection, XSS), buffer overflows, and data manipulation by ensuring that only safe and expected data is processed.
		Protection of Data Integrity: By validating input data, applications can safeguard the integrity of their data and prevent corruption or manipulation caused by invalid inputs.
		Enhancement of Application Reliability: Validating input data helps in creating more reliable and robust applications by reducing the likelihood of unexpected behaviour or crashes due to invalid input.
		Improvement of User Experience: Proper input validation enhances the user experience by providing timely feedback to users about any errors or issues with their input, helping them to correct mistakes and complete tasks more efficiently.
		Compliance with Regulations: Input validation is often required to comply with regulatory standards and data protection laws that mandate the secure handling and processing of sensitive information.
		Adaptation to Changing Requirements: Input validation should be adaptable to changing requirements and evolving threats, allowing applications to maintain a high level of security and integrity over time.


* What can be achieved with Input Validation as a security measure?
This is how input validation can be used to implement security measures.

1. Prevention of Injection threats: By cleaning user inputs and making sure they don't include malicious code or unauthorised commands, input validation helps avoid a variety of injection threats, including SQL injection, NoSQL injection, and command injection.

2. Cross-Site Scripting (XSS) Mitigation: Through input validation and sanitization, attackers can lessen the likelihood of XSS assaults, in which malicious scripts are injected into websites that other users are seeing, hence jeopardising their security.

3. Defence Against Cross-Site Request Forgery (CSRF): By confirming and validating input data, making sure that requests come from reliable sources, and stopping attackers from carrying out illegal actions on behalf of users, input validation helps lessen the impact of CSRF assaults.

4. Preventing Buffer Overflows: By restricting the amount and duration of input data, input validation helps avoid buffer overflow vulnerabilities by making sure that it stays inside the allotted buffer space and so reducing the possibility of memory corruption and exploitation.

5. Reduction of Data Tampering Risks: Input validation lowers the possibility of data tampering attacks, in which hackers alter input data in order to obtain unauthorised access, change confidential information, or interfere with the operation of an application.

6. Improvement of Authentication and Authorization: By verifying user credentials and input parameters, input validation ensures that only authorised users can access sensitive resources and carry out authorised operations. This is a critical function of input validation in authentication and authorization processes.

7. Enhancement of Data Confidentiality: By verifying and cleaning input data, limiting the possibility of data leaks or exposure, and preventing unauthorised access to sensitive information, input validation helps to improve data confidentiality.

8. Mitigate Denial of Service (DoS) and Distributed Denial of Service (DDoS) Attacks: Input validation assists in mitigating DDoS and DoS attacks by filtering and validating incoming requests. This keeps attackers from flooding the application with malicious traffic and interfering with its availability.

9. Compliance with Security Standards and Regulations: GDPR, PCI DSS, OWASP Top 10, and other security standards and best practices require the secure handling and processing of user data in order to preserve privacy and avert security breaches. Putting input validation into practice helps guarantee compliance with these requirements.

10. Enhancement of Trust and Reputation: In the eyes of clients, partners, and stakeholders, the organization's credibility and reputation are maintained when effective input validation raises user trust and confidence in the security of the application.

* Explain the existing types of input validation. Please focus only on Normalizing Input to UTF-8, Syntax Validation, Regular Expression Validation, and Allow-List Validation

		Normalizing Input to UTF-8:
Purpose: Normalizing input to UTF-8 involves converting input data into a standardized character encoding format, specifically UTF-8. This helps ensure consistency and compatibility across different systems and prevents encoding-related vulnerabilities.
Process: Input data may come in various character encodings, such as UTF-16, ISO-8859-1, or others. Normalization to UTF-8 involves detecting the encoding of the input data and converting it into UTF-8 encoding if it's not already in that format. This includes handling characters that may not be representable in the target encoding.
Benefits: Normalizing input to UTF-8 helps prevent encoding-related security issues such as UTF-8 overlong sequences, UTF-7 attacks, and other encoding discrepancies that could lead to data corruption or exploitation.
		Syntax Validation:
Purpose: Syntax validation ensures that input data adheres to the expected format or syntax required by the application. It verifies that input follows predefined rules, such as correct data types, lengths, and patterns.
Process: Syntax validation involves checking the structure, formatting, and constraints of input data. For example, validating email addresses to ensure they contain the "@" symbol and a valid domain name or validating dates to ensure they follow a specific format (e.g., YYYY-MM-DD).
Benefits: Syntax validation helps prevent common input errors and ensures that data is in the expected format before further processing, reducing the risk of data corruption, system errors, and security vulnerabilities.
		Regular Expression Validation:
Purpose: Regular expression (regex) validation involves using predefined patterns to match and validate input data against specific criteria. It allows for more complex and flexible validation rules than simple syntax validation.
Process: Developers define regex patterns that describe the allowed input formats or patterns. Input data is then checked against these patterns to determine if it matches the expected criteria. For example, validating passwords to ensure they meet complexity requirements (e.g., containing uppercase letters, lowercase letters, digits, and special characters).
Benefits: Regular expression validation provides a powerful mechanism for enforcing complex validation rules, such as pattern matching, character classes, and quantifiers, allowing for precise validation of input data and enhanced security against various types of attacks.
		Allow-List Validation:
Purpose: Allow-list validation, also known as whitelisting, involves defining a set of permitted values or patterns that input data must adhere to. It focuses on explicitly allowing known, trusted inputs while rejecting all others.
Process: Developers specify a list of acceptable values, formats, or patterns that input data must match to be considered valid. Any input data that does not match the allow-list criteria is rejected or flagged as invalid.
Benefits: Allow-list validation helps prevent unexpected or malicious data from being processed by restricting input to a predefined set of known, trusted values. It provides a proactive approach to input validation, reducing the risk of data manipulation, injection attacks, and other security vulnerabilities.






