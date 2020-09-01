package function;

import java.util.ArrayList;

import variable.Pet;

public class User {

	public static int rowNum = 0;
	
	public boolean login(String id, String pw){
		boolean isCheck = false;
		
		for (int i = 0; i < Pet.getArrList().size(); i++) {
			if(Pet.getArrList().get(i).indexOf(id) != -1) {
				Pet.setPw(Pet.getArrList().get(i).get(1));
				if(pw.equals(decrypt())) {
					isCheck = true;
					rowNum = i;
				}
			}
		}
		return isCheck;
	}
	
	public boolean join() {
		ArrayList<String> arUser = new ArrayList<>();
		boolean isCheck = false;
		int idCheckDup = 0;
		arUser.add(Pet.getId());
		arUser.add(encrypt());
		for (int i = 0; i < Pet.getArrList().size(); i++) {
			if(Pet.getArrList().get(i).indexOf(arUser.get(0)) != -1) {
				idCheckDup ++;
			}
		}
		if(idCheckDup == 0) {
			Pet.getArrList().add(arUser);
			isCheck = true;
		}
		System.out.println(Pet.getArrList());
		return isCheck;
	}
	public String encrypt() {
		String enPw = "";
		for (int i = 0; i < Pet.getPw().length(); i++) {
			enPw += ""+(char)(Pet.getPw().charAt(i) << 1);
		}
		
		return enPw;
	}
	public String decrypt() {
		String dePw = "";
		for (int i = 0; i < Pet.getPw().length(); i++) {
			dePw += ""+(char)(Pet.getPw().charAt(i) >> 1);
		}
		return dePw;
	}
	
}











