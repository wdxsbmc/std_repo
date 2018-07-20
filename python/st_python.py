#test split
s = 'aaa,bbb, ,ccc,\x1b,ddd'
print(s)
sp = s.split()
print(sp)



#test  dict
aaa = {1:'a',2:'b',3:'c',4:'bbb'}
print(aaa)
for k,v in aaa.items():
    print(k)
    print(v)
    print("%s:%s"%(k,v))


#for
char=[1,2,3,4,5,6]
for i,c in enumerate(char):
    print(i,c)

#lambda
print('test lambda')
def test_lambda(a,b,f):
    return f(a,b)

result = test_lambda(1,2,lambda a,b:a+b)
print(result)
