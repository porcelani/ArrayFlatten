package com.porcelani;

import static java.lang.System.arraycopy;

public class Arrays {

    public static Integer[] flatten(Object[] arrayOfArrays) {

        Integer[] result = new Integer[]{};

        for (Object element : arrayOfArrays) {
            if (element instanceof Integer)
                result = concat(result, new Integer[]{(Integer) element});
            else if (element instanceof Integer[])
                result = concat(result, (Integer[]) element);
            else
                result = concat(result, flatten((Object[]) element));
        }

        return result;
    }

    public static Integer[] concat(Integer[] a, Integer[] b) {
        Integer length = a.length + b.length;
        Integer[] result = new Integer[length];
        arraycopy(a, 0, result, 0, a.length);
        arraycopy(b, 0, result, a.length, b.length);
        return result;
    }


}
