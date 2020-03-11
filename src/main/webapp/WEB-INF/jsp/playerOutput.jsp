<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="Fib-Player 8000" />

<%@include file="common/header.jspf"%>

		<h1 style="padding-top:100px;">Here is the output</h1>
		<p>(I have temporarily limited the player to the first 45 sequences)<p>
		<h3>These are the generated sequences</h3>
		<div class="display">
			<ul>
				<c:forEach items="${numBook}" var="numSeq" varStatus="loop" >
					<li>sequence <c:out value="${loop.index + 1}"/>:</li>
					<li>
						<c:forEach items="${numSeq.seq}" var="num">
							<c:out value="${num}, "/> 
						</c:forEach> 
					</li>
				</c:forEach>
			</ul>
		</div>		
		
		<h3>These are the notes that will play</h3>
		<div class="display">
			<ul>
				<c:forEach items="${noteBook}" var="noteSeq" varStatus="loop">
					<li>sequence <c:out value="${loop.index + 1}"/>:</li>
					<li>
						<c:forEach items="${noteSeq.seq}" var="note">
							${note},
						</c:forEach> 
					</li>
				</c:forEach>
			</ul>
		</div>		

<%@include file="common/footer.jspf"%>