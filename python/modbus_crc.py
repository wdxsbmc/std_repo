import crcmod


if __name__ == '__main__':
     crc_array = b'\x01\x03\x00\x00\x00\x01'   #0x0A84
     #Name Identifier-name, Poly  Reverse Init-value XOR-out Check
     # ['modbus','CrcModbus',0x18005,REVERSE,0xFFFF,0x0000,0x4B37]
     crc16 = crcmod.mkCrcFun(0x18005, rev=True, initCrc=0xFFFF, xorOut=0x0000)
 
     print(hex(crc16(crc_array))) #计算得到的CRC

