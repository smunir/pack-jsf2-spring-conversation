## Copyright 2015 JAXIO http://www.jaxio.com
##
## Licensed under the Apache License, Version 2.0 (the "License");
## you may not use this file except in compliance with the License.
## You may obtain a copy of the License at
##
##    http://www.apache.org/licenses/LICENSE-2.0
##
## Unless required by applicable law or agreed to in writing, software
## distributed under the License is distributed on an "AS IS" BASIS,
## WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
## See the License for the specific language governing permissions and
## limitations under the License.
##
$output.java($WebUtil, "PrimeFacesUtil")##

$output.require("javax.servlet.http.HttpServletRequest")##
$output.require("org.primefaces.PrimeFaces")##

/**
 * Use this bean to execute JavaScript on client side.
 */
public final class $output.currentClass {

    private ${output.currentClass}(){
    }
    
    /**
     * Tells the client to update the search results region with the passed text.
     */
    public static void updateSearchResultsRegion(String text, int nbResults) {
    	if (PrimeFaces.current() != null) {
        	PrimeFaces.current().executeScript("APP.updateSearchResultsRegion(\"" + text + "\"," + nbResults + ")");
        }
    }

    public static boolean isAjax(HttpServletRequest request) {
        return "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
    }

    public static void forceClose() {
    	PrimeFaces.current().executeScript("APP.menu.forceClose()");
    }
}
