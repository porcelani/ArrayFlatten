# coding: utf-8

from python import arrays


def test_simple_array():
    assert arrays.flatten([1, 2, 3, 4]) == [1, 2, 3, 4]


def test_two_level_array():
    assert arrays.flatten([[1], [2], [3], [4]]) == [1, 2, 3, 4]


def test_three_level_array():
    assert arrays.flatten([[1, 2, [3]], 4]) == [1, 2, 3, 4]
