<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>
</head>
<body>
    <h2>hello<h2>

        <#list resultList as item>
            ${item} <br/>
        </#list>

        <button type="submit"> click me</button>
    </body>
</html>