package io.shadowstack;

public interface ArgumentConverter<F, T> {
    /**
     * Converts using a newly created instance
     * @param from instance from which to convert
     * @return newly created instance of the target type
     * @throws AdapterException wraps throwables generated during conversion
     */
    T convert(F from) throws AdapterException;

    /**
     * Converts using an existing instance
     * @param from instance from which to convert
     * @param to existing instance of the target type
     * @throws AdapterException wraps throwables generated during conversion
     */
    void convert(F from, T to) throws AdapterException;
}
