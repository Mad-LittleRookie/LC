str = input()
nums = str[1:-1]
nums = nums.split(",")
i = 0
count = 0
leng = len(nums)
judge = 0;
for length in nums:
    if (i==leng-1):
        break
    for number in nums:
        if (count==leng):
            break
        if (nums[count] == nums[i]) :
            judge += 1
        if (judge==2):
            print("true")
            exit()
        count += 1
    i += 1
    judge = 0
    count = 0
print("false")
exit()



