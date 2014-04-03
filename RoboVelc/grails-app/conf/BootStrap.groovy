import login.*

class BootStrap {

    def init = { servletContext ->
    	if(!User.count()){
    		createUser()
    	}
    }
    def destroy = {
    }

    def createUser(){
    	def user = new User (username:"user",password:"user",enabled:true,accountExpired:false,accountLocked:false,passwordExpired:false)
    	user.save(flush:true)

    	def role = new Authority(authority: 'ROLE_USER');
        role.save(flush:true)

    	UserAuthority.create(user, role, true)
    }     
}
