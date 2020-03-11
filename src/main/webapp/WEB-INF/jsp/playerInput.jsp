<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="Song Configuration" />

<%@include file="common/header.jspf"%>


<h1>Hello Fibonacci!</h1>
<h4>Please input parameters</h4>

<form action="playerInput" method="post">
<span>
<label for="seedOne">First Seed :</label>
<select name="seedOne" id="seedOne">
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
</select>
<!-- This is a text field entry line for seed
<input type="text" name="seedOne" id="seedOne"> -->
<label for="seedTwo">Second Seed :</label>
<select name="seedTwo" id="seedTwo">
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
</select>
<!-- This is a text field entry line for seed
<input type="text" name="seedTwo" id="seedTwo"> -->

<label for="key">Key :</label>
<select name="key" id="key">
	<option value="C">C</option>
	<option value="B#">B#</option>
	<option value="G">G</option>
	<option value="D">D</option>
	<option value="A">A</option>
	<option value="E">E</option>
	<option value="Fb">Fb</option>
	<option value="B">B</option>
	<option value="Cb">Cb</option>
	<option value="F#">F#</option>
	<option value="Gb">Gb</option>
	<option value="C#">C#</option>
	<option value="Db">Db</option>
	<option value="Ab">Ab</option>
	<option value="G#">G#</option>
	<option value="Eb">Eb</option>
	<option value="D#">D#</option>
	<option value="Bb">Bb</option>
	<option value="A#">A#</option>
	<option value="F">F</option>
	<option value="E#">E#</option>
	<option value="Am">Am</option>
	<option value="Em">Em</option>
	<option value="Fbm">Fbm</option>
	<option value="Bm">Bm</option>
	<option value="Cbm">Cbm</option>
	<option value="F#m">F#m</option>
	<option value="Gbm">Gbm</option>
	<option value="C#m">C#m</option>
	<option value="Dbm">Dbm</option>
	<option value="G#m">G#m</option>
	<option value="Abm">Abm</option>
	<option value="D#m">D#m</option>
	<option value="Ebm">Ebm</option>
	<option value="A#m">A#m</option>
	<option value="Bbm">Bbm</option>
	<option value="Fm">Fm</option>
	<option value="E#m">E#m</option>
	<option value="Cm">Cm</option>
	<option value="B#m">B#m</option>
	<option value="Gm">Gm</option>
	<option value="Dm">Dm</option>
</select>
<!-- This is the old tet inpt fied for key
<input type="text" name="key" id="key"> -->
</span>
<input type="submit" value="Let's Play">
</form> 

<%@include file="common/footer.jspf"%>