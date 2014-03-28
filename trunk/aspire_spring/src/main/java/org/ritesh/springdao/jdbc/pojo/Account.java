/**
 * 
 */
package org.ritesh.springdao.jdbc.pojo;

import java.io.Serializable;

/**
 * Pojo class for Account table in db
 * 
 * @author Ritesh Kumar
 * @since Feb 23, 2014
 * @version 1.0.0
 */
public class Account implements Serializable {

	/**
	 * Generate version id
	 */
	private static final long serialVersionUID = 1210731451612969792L;
	private int acc_no;
	private String acc_holder_name;
	private String acc_type;
	private double acc_bal;

	/**
	 * @return the acc_no
	 */
	public int getAcc_no() {
		return acc_no;
	}

	/**
	 * @param acc_no
	 *            the acc_no to set
	 */
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	/**
	 * @return the acc_holder_name
	 */
	public String getAcc_holder_name() {
		return acc_holder_name;
	}

	/**
	 * @param acc_holder_name
	 *            the acc_holder_name to set
	 */
	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}

	/**
	 * @return the acc_type
	 */
	public String getAcc_type() {
		return acc_type;
	}

	/**
	 * @param acc_type
	 *            the acc_type to set
	 */
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	/**
	 * @return the acc_bal
	 */
	public double getAcc_bal() {
		return acc_bal;
	}

	/**
	 * @param acc_bal
	 *            the acc_bal to set
	 */
	public void setAcc_bal(double acc_bal) {
		this.acc_bal = acc_bal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(acc_bal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((acc_holder_name == null) ? 0 : acc_holder_name.hashCode());
		result = prime * result + acc_no;
		result = prime * result
				+ ((acc_type == null) ? 0 : acc_type.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Account)) {
			return false;
		}
		Account other = (Account) obj;
		if (Double.doubleToLongBits(acc_bal) != Double
				.doubleToLongBits(other.acc_bal)) {
			return false;
		}
		if (acc_holder_name == null) {
			if (other.acc_holder_name != null) {
				return false;
			}
		} else if (!acc_holder_name.equals(other.acc_holder_name)) {
			return false;
		}
		if (acc_no != other.acc_no) {
			return false;
		}
		if (acc_type == null) {
			if (other.acc_type != null) {
				return false;
			}
		} else if (!acc_type.equals(other.acc_type)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", acc_holder_name="
				+ acc_holder_name + ", acc_type=" + acc_type + ", acc_bal="
				+ acc_bal + "]";
	}

}
