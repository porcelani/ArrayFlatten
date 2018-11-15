def flatten(array):
    result = []

    for element in array:
        if isinstance(element, int):
            result.append(element)
        else:
            result = result + flatten(element)
    return result
