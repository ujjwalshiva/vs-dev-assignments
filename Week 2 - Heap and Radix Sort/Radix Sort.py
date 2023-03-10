def radixSort(arr):
    max_val = max(arr)
    counter = 1
    while ((max_val//counter)>0):
        count = [0] * 10
        for i in arr:
            count[(i//counter) % 10] += 1
        for i in range(1, 10):
            count[i] += count[i - 1]
        output = [0] * len(arr)
        for i in reversed(arr):
            count[(i//counter) % 10] -= 1
            output[count[(i // counter) % 10]] = i
        for i in range(len(arr)):
            arr[i] = output[i]
        counter = counter * 10
    return arr


arr = [90, 80, 70, 60, 50, 40, 30, 20, 10]
print("Sorted Array using Radix Sort: \n", *radixSort(arr))
