public class Cuenta {
	private String Nombre;
	private float Saldo=0;
	private int Pin;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public float getSaldo() {
		return Saldo;
	}

	public void setSaldo(float Saldo) {
		this.Saldo = Saldo;
	}

	public int getPin() {
		return Pin;
	}

	public void setPin(int Pin) {
		this.Pin = Pin;
	}
}
