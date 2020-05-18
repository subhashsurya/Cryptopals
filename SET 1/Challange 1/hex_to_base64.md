What is Base64 Encoding?
Basically its a type of conversion of bytes to ascii characters.
base64 contains set of:-
    :26Uppercase
    :26Lowercase
    :0-9numbers
    :+/ for new lines
After conversion of Base64 to binary each character represent 6 bits of information.
How it actually works?
    Take ascii value of each character in string.
    Calculate 8 bit binary equivalent of ascii values.
    Group them into 6 bit chunks.
    Convert each 6 bit binary value to its decimal ones.
    Using base64 encoding table assign the respective base64 character for each value.
Why to use base64
base64 is a popular method to get binary values of ascii characters,which are widedly understood by network and application.
The problem with binary number was all the information are in form of 0's and 1's and some communication channels or application were not able to understant all the bits they recevied.
common example is mail systems as it contains both the text as well as media.
