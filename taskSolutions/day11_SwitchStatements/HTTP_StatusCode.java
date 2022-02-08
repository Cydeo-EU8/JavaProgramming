package day11_SwitchStatements;

public class HTTP_StatusCode {

    public static void main(String[] args) {

        int statusCode = 200;
        String result = "";

        switch (statusCode) {

            case 200:
                result = "OK";
                break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Accepted";
                break;
            case 301:
                result = "Moved Permanently";
                break;
            case 303:
                result = "See Other";
                break;
            case 304:
                result = "Not Modified";
                break;
            case 307:
                result = "Temporary Redirect";
                break;
            case 400:
                result = "Bad Request";
                break;
            case 401:
                result = "Unauthorized";
                break;
            case 403:
                result = "Forbidden";
                break;
            case 404:
                result = "Not Found";
                break;
            case 410:
                result = "Gone";
                break;
            case 500:
                result = "Internal Server Error";
                break;
            case 503:
                result = "Service Unavailable";
                break;
            default:
                result = "Invalid Status Code";

        }

        System.out.println(result);


    }

}
/*
5. HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.

   here are dome of the codes and their meanings are listed below:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable

    declare an int variable called StatusCode, write a switch that prints out,
    on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

 */