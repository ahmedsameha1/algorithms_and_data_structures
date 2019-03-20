def search(lst, num):
    return search_recursive(lst, 0, len(lst) - 1, num)

def search_recursive(lst, start, end, num):
    median = (start + end) // 2
    if lst[median] == num:
        return True
    elif end - start < 1:
        return False
    elif lst[median] > num:
        return search_recursive(lst, start, median - 1, num)
    else:
        return search_recursive(lst, median + 1, end, num)
