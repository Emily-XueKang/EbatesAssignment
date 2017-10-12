# EbatesAssignment
Source Code is in EbatesAssignment/src/main/java/Caller class

Executable jar file is in EbatesAssignment/out/artifacts/EbatesAssignment_jar/EbatesAssignment.jar

Run the jar file with command: java -jar EbatesAssignment.jar

The approximate running time of this script is 1.5 munites.

# LobSendLetter

Steps to run this program:
1.unzip the package
2.open terminal, in command line, cd into the directory of "lobsendletter"
3.(opetional)run "mvn clean package" to generate the target jar file, I have already run maven and generated the executable jar, so this step can be skipped.
4.in cammanlin, execute lob-1.0.jar with input, as below:
java -cp target/lob-1.0.jar SendLetter -n "Joe Schmoe" -a1 "185 Berry Street" -a2 "Suite 170" -c "San Francisco" -s CA -z 94107 -m "This is a test letter for Lob’s coding challenge. Thank you legislator."

