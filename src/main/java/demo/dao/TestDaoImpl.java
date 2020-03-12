package demo.dao;

import org.springframework.stereotype.Service;

@Service
public class TestDaoImpl implements TestDao{
	@Override
	public void sayHello() {
		System.out.println("Hello, 软件173滕如坤!");
	}
}
