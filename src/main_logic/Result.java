package main_logic;

public class Result extends DataTransfer {

	// result codes to be expanded to meet the needs of additional functionalities
	// of the front/back end of the house.

	public enum Code {
		SUCCESS, IO_ERROR, LONG_LIST_ERROR, NO_TRANSACTIONS,
	} // ...

	private Code resultCode;

	public Code getCode() {
		return resultCode;
	}

	public void setCode(Code resultCode) {
		this.resultCode = resultCode;
	}

}
