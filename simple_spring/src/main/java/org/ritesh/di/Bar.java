/**
 * 
 */
package org.ritesh.di;

/**
 * @author Ritesh Kumar
 * 
 */
public class Bar {
	private String name;
	private int age;
	private Foo foo;

	/*public Bar() {
	}*/

	public Bar(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}

	public void processFooName() {
		System.out.println("Name of FOO is injected: " + foo.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bar [name=" + name + ", age=" + age + "]";
	}

}
