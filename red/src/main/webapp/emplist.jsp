<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
							    头像
							</td>
							<td>
								姓名
							</td>
							<td>
								工资
							</td>
							<td>
								年龄
							</td>
							<td>
								部门名称
							</td>
							<td>
								操作
							</td>
						</tr>
                        <c:forEach var="s" items="${list}">
                            <tr>
                                <td>
                                    ${s.id}
                                </td>
                                <td>
                                    img
                                </td>
                                <td>
                                    ${s.name}
                                </td>
                                <td>
                                    ${s.salary}
                                </td>
                                <td>
                                    ${s.age}
                                </td>
                                <td>
                                    ${department.name}
                                </td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/Staff/delete.do?departmentId=${s.departmentId}&id=${s.id}">删除</a>&nbsp;<a href="${pageContext.request.contextPath}/Staff/updateStaff.do?id=${s.id}">修改</a>
                                </td>

                            </tr>
                        </c:forEach>

					</table>
					
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
