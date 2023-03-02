import threading

def reverseWord(word,lst):
    return lst.append(word[::-1])

para = "Hi there! My name is Ujjwal"

paraList = para.split(' ')
reversedParaList = []

threads = []
for word in paraList:
    thread = threading.Thread(target=reverseWord, args=(word,reversedParaList))
    threads.append(thread)

for thread in threads:
    thread.start()
    
for thread in threads:
    thread.join()

print(*reversedParaList)
