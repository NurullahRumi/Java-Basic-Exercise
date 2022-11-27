package com.oop.functionainterface;

@FunctionalInterface
public interface FunctionalReturn<T, R> {
	public T show(R r);
}
