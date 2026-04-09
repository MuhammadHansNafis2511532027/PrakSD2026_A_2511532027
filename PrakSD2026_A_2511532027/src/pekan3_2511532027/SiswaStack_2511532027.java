package pekan3_2511532027;

import java.util.ArrayList;
class Siswa_2027 {
	String nama_2027;
	int nim_2027;
	
	public Siswa_2027(String nama_2027, int nim_2027) {
		this.nama_2027 = nama_2027;
		this.nim_2027 = nim_2027;
	}
	
	@Override
	public String toString() {
		return "Nim : " + nim_2027 + ", Nama : " + nama_2027;
	}
}
public class SiswaStack_2511532027 {
	private ArrayList<Siswa_2027> stack_2027;
	
	public SiswaStack_2511532027() {
		stack_2027 = new ArrayList<>();
	}
	
	public void push_2027(Siswa_2027 mhs_2027) {
		stack_2027.add(mhs_2027);
	}
	
	public Siswa_2027 pop_2027() {
		if (!isEmpty()) {
			return stack_2027.remove(stack_2027.size() - 1);
		}
		return null;
	}
	
	public Siswa_2027 peek_2027() {
		if (!isEmpty()) {
			return stack_2027.get(stack_2027.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack_2027.isEmpty();
	}
	
	public void tampilkanMahasiswa_2027() {
		for (int i = stack_2027.size() - 1; i >= 0; i--) {
			System.out.println(stack_2027.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511532027 studentStack_2027 = new SiswaStack_2511532027();
		
		Siswa_2027 mhs1_2027 = new Siswa_2027("Ali", 1);
		Siswa_2027 mhs2_2027 = new Siswa_2027("Boby", 2);
		Siswa_2027 mhs3_2027 = new Siswa_2027("Charles", 3);
		
		studentStack_2027.push_2027(mhs1_2027);
		studentStack_2027.push_2027(mhs2_2027);
		studentStack_2027.push_2027(mhs3_2027);
		
		System.out.println("Siswa di dalam stack : ");
		studentStack_2027.tampilkanMahasiswa_2027();
		
		System.out.println("Siswa teratas " + studentStack_2027.peek_2027());
		System.out.println("Mengeluarkan siswa teratas dari stack : " + studentStack_2027.pop_2027());
		System.out.println("Daftar siswa setelah di pop : ");
		studentStack_2027.tampilkanMahasiswa_2027();
	}
}
