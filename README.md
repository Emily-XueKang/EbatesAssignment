# EbatesAssignment
Source Code is in EbatesAssignment/src/main/java/Caller class

Executable jar file is in EbatesAssignment/out/artifacts/EbatesAssignment_jar/EbatesAssignment.jar

Run the jar file with command: java -jar EbatesAssignment.jar

The approximate running time of this script is 1.5 munites.

# LobSendLetter

Steps to run this program:

1.Unzip the package

2.Open terminal, in command line, cd into the directory of "lobsendletter"

3.(opetional)Run "mvn clean package" to generate the target jar file, I have already run maven and generated the executable jar, so this step can be skipped.

4.In cammanlin, execute lob-1.0.jar with parameters, copy and paste command as below:

    java -cp target/lob-1.0.jar SendLetter -n "Joe Schmoe" -a1 "185 Berry Street" -a2 "Suite 170" -c "San Francisco" -s CA -z 94107 -m "This is a test letter for Lob’s coding challenge. Thank you legislator."

5.More on parameters of this program: -n is the name of sender, -a1 is address line 1, -a2 is address line2, -c is city, -s is state, -z is zip code, -m is the message body

    using double quotes to embrace input strings in one parameter



