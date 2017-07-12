package com;

class Emp {
	private int empId;
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}

public class Demo<E> {
	Object[] objs = new Object[10];
	int size;
	int length = 1;

	void add(E obj) {
		//objs[size] = new Object();
		objs[size] = obj;
		size++;
		length++;
	}

	E get(Object obj) {
		Object results = null;
		for (Object o : objs) {
			if (obj.equals(o))
				results = obj;

		}
		return (E) results;
	}

	E getByIndex(int index) {
		Object result = null;
		if (index >= 0) {
			result = objs[index];
		}
		return (E) result;
	}

	int getSize() {
		return length;
	}

	public static void main(String[] args) {

		Demo<Object> d = new Demo<Object>();
		d.add(new String("Abc"));
		d.add(100);
		d.add(76.45f);

		Emp e = new Emp();
		e.setEmpId(10);
		e.setEmpName("Praveen");

		d.add(e);

		System.out.println("Size: " + d.getSize());
		System.out.println("data: " + d.get("AbcXyz"));
		System.out.println("Index 2 value is " + d.getByIndex(2));

	}

}
