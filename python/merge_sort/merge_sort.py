def sort(lst):
    if len(lst) < 2:
        return lst
    else:
        return merge(sort(lst[0:len(lst) // 2]), sort(lst[(len(lst) // 2) : len(lst)]))

def merge(lst1, lst2):
    merged = []
    i = 0
    j = 0
    while len(merged) < len(lst1) + len(lst2):
        if i >= len(lst1) or (j < len(lst2) and lst2[j] < lst1[i]):
            merged.append(lst2[j])
            j += 1
        else:
            merged.append(lst1[i])
            i += 1
    return merged
