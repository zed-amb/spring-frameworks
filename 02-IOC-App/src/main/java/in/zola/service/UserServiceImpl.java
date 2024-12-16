package in.zola.service;

import in.zola.dao.IUserDao;

public class UserServiceImpl implements UserService{

	private IUserDao userdao;

	
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl ::0 - param constructor");
	}


	public UserServiceImpl(IUserDao userdao) {
		System.out.println("UserServiceImpl :: param constructor");
		this.userdao = userdao;
	}


	@Override
	public String getName(int id) {

		return userdao.findName(id);
	}


}
