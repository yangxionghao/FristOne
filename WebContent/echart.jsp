<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
   <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    
    <script src="https://cdn.staticfile.org/echarts/4.3.0/echarts.min.js"></script>
    
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
   <%--分类检索--%>
                    <div class="tab-pane active" id="panel-169507">
                        <form  action="${pageContext.request.contextPath}/tubiao_Servlet" method="post" >
                            <div class="row-fluid">
                                <div class="span12">
                                <h4>
                   选择图表类型                                  <select id="tblx" class="form-control" style="width: 200px;height: 40px;display: inline" name="tblx">
                                            <option value = "zzt">柱状图</option>
                                            <option value = "zxt">折线图</option>
                                        </select>
                                        <input type="submit" class="btn btn-success" style="width: 200px;height:30px;position: relative;left: 100px" value="显示">
                                    </h4>
                                </div>

                            </div>
                        </form>
                        
                        
                       <div id="main" style="width: 700px;height:400px;" >
                        <script type="text/javascript">
                        $(function() {
      	                   if('${tblx}'=="zzt"){
      	                	   var myChart = echarts.init(document.getElementById('main'));
      	                	   var arr = new Array();
      	                	   var index = 0;
      	                	   <c:forEach items="${listtb}" var="item"> 
      	                	       arr[index++] = ${item.count};
      	                	   </c:forEach>
      	                	   // 指定图表的配置项和数据
      	                	   var option = {
      	                	       title: {
      	                	           text: '统计图表'
      	                	       },
      	                	       tooltip: {
      	                	           show: true
      	                	       },
      	                	       legend: {
      	                	           data:['统计数']
      	                	       },
      	                	       xAxis : [
      	                	           {
      	                	               type : 'category',
      	                	               axisLabel:{  
      	                	     	           interval:0,//横轴信息全部显示  
      	                	     	           rotate:40,//-30度角倾斜显示  
      	                	     	            },
      	                	               data : [
      	                	                   <c:forEach items="${listtb}" var="item">
      	                	                   ["${item.type}"],
      	                	                   </c:forEach>
      	                	               ]
      	                	           }
      	                	       ],
      	                	       yAxis : [
      	                	           {
      	                	               type : 'value'
      	                	           }
      	                	       ],
      	                	       series : [
      	                	           {
      	                	               name:'统计数',
      	                	               type:'bar',
      	                	               data: arr
      	                	               
      	                	           }
      	                	       ]
      	                	   };

      	                	   // 使用刚指定的配置项和数据显示图表。
      	                	   myChart.setOption(option);
      	                    }else{
      	                    	var myChart = echarts.init(document.getElementById('main'));
      	                    	var arr = new Array();
      	                    	var index = 0;
      	                    	<c:forEach items="${listtb}" var="item"> 
      	                    	    arr[index++] = ${item.count};
      	                    	</c:forEach>

      	                    	// 指定图表的配置项和数据
      	                    	var option = {
      	                    	    title: {
      	                    	        text: '统计图表'
      	                    	    },
      	                    	    tooltip: {
      	                    	        show: true
      	                    	    },
      	                    	    legend: {
      	                    	        data:['统计数']
      	                    	    },
      	                    	    xAxis : [
      	                    	        {
      	                    	            type : 'category',
      	                    	            axisLabel:{  
      	                    	  	           interval:0,//横轴信息全部显示  
      	                    	  	           rotate:40,//-30度角倾斜显示  
      	                    	  	            },
      	                    	            data : [
      	                    	                <c:forEach items="${listtb}" var="item">
      	                    	                ["${item.type}"],
      	                    	                </c:forEach>
      	                    	            ]
      	                    	        }
      	                    	    ],
      	                    	    yAxis : [
      	                    	        {
      	                    	            type : 'value'
      	                    	        }
      	                    	    ],
      	                    	    series : [
      	                    	        {
      	                    	            name:'统计数',
      	                    	            type:'line',
      	                    	            data: arr
      	                    	            
      	                    	        }
      	                    	    ]
      	                    	};

      	                    	// 使用刚指定的配置项和数据显示图表。
      	                    	myChart.setOption(option);
      	                       }
						});
                     </script>
                       </div> 
                        
                        
                        
                        
                        <div class="row-fluid">
                            <div class="span12">
                                <table class="table table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>需求名称</th>
                                        <th>学科分类</th>
                                        <th>归口管理单位</th>
                                        <th>机构全称</th>
                                        <th>机构属性</th>
                                        <th>法人代表</th>
                                        <th>联系人</th>
                                        <th>所在地域</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="m" items="${list}">
                                        <tr>
                                            <td>${m.jsxqmc}</td>
                                            <td>${m.xkfl}</td>
                                            <td>${m.gkglbm}</td>
                                            <td>${m.jgmc}</td>
                                            <td>${m.jgsx}</td>
                                            <td>${m.frdb}</td>
                                            <td>${m.lxr}</td>
                                            <td>${m.szdy}</td>
                                            <td><a href="${pageContext.request.contextPath}/xssh1_Servlet?wjid=${m.wjid}&sy=fljs"><button class="btn btn-success">查看</button></a></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                       
                    </div>
</body>


</html>