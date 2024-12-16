package in.zola.dao;

public class UserDaoImpl implements IUserDao {

	public UserDaoImpl() {
		System.out.println("UserDaoImpl :: Constructor");
	}
	@Override
	public String findName(int id) {
		
		if(id == 100) {
			return "Milto";
		}else if(id == 101) {
			return "Nemo";
		}
		return null;
	}

}
