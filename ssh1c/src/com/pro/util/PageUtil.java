package com.pro.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.criterion.DetachedCriteria;

import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.pro.service.BaseService;

public class PageUtil {
	public static final int PAGESIZE=3;
	public static void pageTool(HttpServletRequest request,BaseService serviceDao,DetachedCriteria dc,int pagesize,String resultName){
		String currentPage = request.getParameter("currentPage");
		if(currentPage==null||"".equals(currentPage)){
			currentPage="1";
		}
		//关注dc的变化
		List list= serviceDao.findByCriteria(Integer.parseInt(currentPage), pagesize, dc);
		int totalRecord=serviceDao.getRowCount(dc);
		request.setAttribute(resultName, list);
		request.setAttribute("totalPage", (totalRecord+pagesize-1)/pagesize);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("pagesize", pagesize);
	}
	public static void getPageJson(HttpServletRequest request,BaseService service,DetachedCriteria dc,Map<Class<?>,Set<String>> paramMap){
		String currentPage=request.getParameter("page");
		String pagesize=request.getParameter("rows");
		pagesize="2";
		if(currentPage==null||"".equals(currentPage)){
			currentPage="1";
		}
		Map<String, Object> maps=new HashMap<String, Object>();
		maps.put("rows",service.findByCriteria(Integer.parseInt(currentPage),Integer.parseInt(pagesize), dc));
		maps.put("total", service.getRowCount(dc));
		//Json.toJSONString(maps);
		/*
		 * ComplexPropertyPreFilter cppf=new ComplexPropertyPreFilter(paramMap);
		 * SerializeWriter sw=new SerializeWriter();相当于StringBuiler，用来拼接字符串
		 * 序列化组合器
		 * JSONSerializer serializer=new JSONSerializer(sw);
		 * $ref(fdf)
		 * serializer.config(SerializeFeature.DisableCircularReferenceDetect,true);
		 * serializer.getPropertyFilters().add(cppf);
		 * serializer.write(maps);
		 * String jsonStr=sw.toString();
		 * System.out.println(jsonStr);
		 * HttpServletResponse response=ServletActionContext.getResponse();
		 * response.setCharacterEncoding("UTF-8");
		 * PrintWriter writer=response.getWriter();
		 * writer.write(jsonStr);
		 * writer.flush();
		 * writer.close();
		 * */
	}
}
