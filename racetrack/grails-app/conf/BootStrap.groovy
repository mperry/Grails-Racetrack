

import grails.util.GrailsUtil
import racetrack.*

class BootStrap {

    
    def init = { servletContext ->
        switch(GrailsUtil.environment){
            case "development":
            def admin = new User(login:"admin",
                password:"admin",
                role:"admin")
            admin.save()
            if(admin.hasErrors()){
                println admin.errors
            }
            def jdoe = new User(login:"jdoe",
                password:"jdoe",
                role:"user")
            jdoe.save()
            if(jdoe.hasErrors()){
                println jdoe.errors
            }
        }
    }
    
    def destroy = {
    }
}
