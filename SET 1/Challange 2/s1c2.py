def xor(bytes_1,bytes_2):
    return bytes([b1^b2 for b1,b2 in zip(bytes_1,bytes_2)])
def main():
     str1= bytes.fromhex('1c0111001f010100061a024b53535009181c')
     print(str1)
     str2= bytes.fromhex('686974207468652062756c6c277320657965')
     print(xor(str1,str2).hex())
if __name__=="__main__":
    main()
 
