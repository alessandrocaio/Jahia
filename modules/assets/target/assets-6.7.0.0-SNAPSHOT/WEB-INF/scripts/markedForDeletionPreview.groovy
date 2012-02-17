println '<?xml version="1.0" encoding="UTF-8"?>'
println '<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"'
println '"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">'
println '<html xmlns="http://www.w3.org/1999/xhtml">'
println '<head>'
println '    <meta name="robots" content="noindex, nofollow"/>'
println '    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />'
println '    <link rel="stylesheet" href="' + renderContext.getRequest().getContextPath() + '/css/admin-1.1.css" type="text/css"/>'
println '    <title>Preview</title>'
println '</head>'
println '<body class="login">'
println '    <div id="adminLogin">'
println '    <h2 class="loginlogo"></h2>'
println '            <br class="clearFloat" />'
println '            <h3 class="loginIcon">' + i18n.get("label.preview") + '</h3>'
println '        	 <p>' + i18n.get("label.preview.markedForDeletion") + '</p>'
println '            <br class="clearFloat" />'
println '    </div>'
println '</body>'
println '</html>'