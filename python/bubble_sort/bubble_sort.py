def sort(lst):
    swap = True
    while swap:
        swap = False
        for i in range(len(lst) - 1):
            if lst[i + 1] < lst[i]:
                temp = lst[i]
                lst[i] = lst[i + 1]
                lst[i + 1] = temp
                swap = True
    return lst
