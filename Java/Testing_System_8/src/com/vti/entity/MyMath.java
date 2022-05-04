package com.vti.entity;

public class MyMath<T extends Number> {
//	private T a, b, c;
//
//	public T sum2numInt(T a, T b) {
//		
//		return (T) (Integer) ((Integer) a + (Integer) b);
//	}
//
//	public T sum2numLong(T a, T b) {
//		return (T) (Long) ((Long) a + (Long) b);
//	}
//
//	public T sum2numDouble(T a, T b) {
//		return (T) (Double) ((Double) a + (Double) b);
//	}
//
//	public T sum3numInt(T a, T b, T c) {
//		return (T) (Integer) ((Integer) a + (Integer) b + (Integer) c);
//	}
//
//	public T sum2numLong(T a, T b, T c) {
//		return (T) (Long) ((Long) a + (Long) b + (Long) c);
//	}
//
//	public T sum2numDouble(T a, T b, T c) {
//		return (T) (Double) ((Double) a + (Double) b + (Double) c);
//	}

	public T add(T a, T b) {
		Double total = a.doubleValue() + b.doubleValue();
		return (T) total;
	}
}
