package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

	@Service
	public class UserDetails implements UserDetailsService 
	{

		@Autowired
		private UserRepository repo;
		
		@Override
		public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			
			User user = repo.findByUsername(username);
			if(user==null)
				throw new UsernameNotFoundException("User 404");
			
			return new UserPrincipal(user);
		}

}
