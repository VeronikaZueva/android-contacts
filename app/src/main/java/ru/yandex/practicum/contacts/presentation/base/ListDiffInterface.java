package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T customObject);

    @Override
    boolean equals(Object object);
}
