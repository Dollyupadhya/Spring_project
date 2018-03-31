package spirng_project;

import java.util.HashMap;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Spring_pkg.Emp;

@RestController
public class Spring_File {
	/*JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate
	};*/
	@RequestMapping(value="/hey",method=RequestMethod.POST)
	public String hey(ModelMap model)
	{
		String msg="Message";
		model.addAttribute("message",msg);
		return"showMessage";
	}
	
	@RequestMapping(value="/hlo",method=RequestMethod.POST)
	public @ResponseBody HashMap<String,String> hit()
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("status","success");
		hm.put("file","spring");
		return hm;
			}
	@RequestMapping(value="/snd",method=RequestMethod.POST)
	public @ResponseBody HashMap<String,Object> maps(@RequestBody Emp mod)
	{
		HashMap<String,Object> hm=new HashMap<String,Object>();	   
		hm.put("Name",mod.getName());
		hm.put("Email",mod.getEmail());
		hm.put("id",mod.getId());
		System.out.println(mod.getName());
		return hm;
	}
	/*@RequestMapping(value="/create",method=RequestMethod.POST)
	public @ResponseBody int insert(Emp e)
	{
		String query="insert into emp value("+e.getName()+","+e.getEmail()+","+e.getId()+")";
		return jdbcTemplate.update(query);
	}*/
	
}
