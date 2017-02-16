package org.apache.mina.proxy.handlers.socks;

import net.sqlcipher.IBulkCursor;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

public class SocksProxyConstants {
    public static final byte BASIC_AUTH = (byte) 2;
    public static final byte BASIC_AUTH_SUBNEGOTIATION_VERSION = (byte) 1;
    public static final byte DOMAIN_NAME_ADDRESS_TYPE = (byte) 3;
    public static final byte ESTABLISH_TCPIP_BIND = (byte) 2;
    public static final byte ESTABLISH_TCPIP_STREAM = (byte) 1;
    public static final byte ESTABLISH_UDP_ASSOCIATE = (byte) 3;
    public static final byte[] FAKE_IP;
    public static final byte GSSAPI_AUTH = (byte) 1;
    public static final byte GSSAPI_AUTH_SUBNEGOTIATION_VERSION = (byte) 1;
    public static final byte GSSAPI_MSG_TYPE = (byte) 1;
    public static final byte IPV4_ADDRESS_TYPE = (byte) 1;
    public static final byte IPV6_ADDRESS_TYPE = (byte) 4;
    public static final String KERBEROS_V5_OID = "1.2.840.113554.1.2.2";
    public static final String MS_KERBEROS_V5_OID = "1.2.840.48018.1.2.2";
    public static final byte NO_ACCEPTABLE_AUTH_METHOD = (byte) -1;
    public static final byte NO_AUTH = (byte) 0;
    public static final String NTLMSSP_OID = "1.3.6.1.4.1.311.2.2.10";
    public static final int SOCKS5_AUTH_STEP = 1;
    public static final int SOCKS5_GREETING_STEP = 0;
    public static final int SOCKS5_REQUEST_STEP = 2;
    public static final int SOCKS_4_RESPONSE_SIZE = 8;
    public static final byte SOCKS_VERSION_4 = (byte) 4;
    public static final byte SOCKS_VERSION_5 = (byte) 5;
    public static final byte[] SUPPORTED_AUTH_METHODS;
    public static final byte TERMINATOR = (byte) 0;
    public static final byte V4_REPLY_REQUEST_FAILED_ID_NOT_CONFIRMED = (byte) 93;
    public static final byte V4_REPLY_REQUEST_FAILED_NO_IDENTD = (byte) 92;
    public static final byte V4_REPLY_REQUEST_GRANTED = (byte) 90;
    public static final byte V4_REPLY_REQUEST_REJECTED_OR_FAILED = (byte) 91;
    public static final byte V5_REPLY_ADDRESS_TYPE_NOT_SUPPORTED = (byte) 8;
    public static final byte V5_REPLY_COMMAND_NOT_SUPPORTED = (byte) 7;
    public static final byte V5_REPLY_CONNECTION_REFUSED = (byte) 5;
    public static final byte V5_REPLY_GENERAL_FAILURE = (byte) 1;
    public static final byte V5_REPLY_HOST_UNREACHABLE = (byte) 4;
    public static final byte V5_REPLY_NETWORK_UNREACHABLE = (byte) 3;
    public static final byte V5_REPLY_NOT_ALLOWED = (byte) 2;
    public static final byte V5_REPLY_SUCCEEDED = (byte) 0;
    public static final byte V5_REPLY_TTL_EXPIRED = (byte) 6;

    static {
        FAKE_IP = new byte[]{V5_REPLY_SUCCEEDED, V5_REPLY_SUCCEEDED, V5_REPLY_SUCCEEDED, (byte) 10};
        SUPPORTED_AUTH_METHODS = new byte[]{V5_REPLY_SUCCEEDED, V5_REPLY_GENERAL_FAILURE, V5_REPLY_NOT_ALLOWED};
    }

    public static final String getReplyCodeAsString(byte b) {
        switch (b) {
            case SOCKS5_GREETING_STEP /*0*/:
                return "Request succeeded";
            case SOCKS5_AUTH_STEP /*1*/:
                return "Request failed: general SOCKS server failure";
            case SOCKS5_REQUEST_STEP /*2*/:
                return "Request failed: connection not allowed by ruleset";
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                return "Request failed: network unreachable";
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                return "Request failed: host unreachable";
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                return "Request failed: connection refused";
            case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                return "Request failed: TTL expired";
            case IBulkCursor.REQUERY_TRANSACTION /*7*/:
                return "Request failed: command not supported";
            case SOCKS_4_RESPONSE_SIZE /*8*/:
                return "Request failed: address type not supported";
            case ERROR_CODE_TYPE_IN_LEAGUE_ALREADY_VALUE:
                return "Request granted";
            case ERROR_CODE_TYPE_NOT_IN_LEAGUE_VALUE:
                return "Request rejected or failed";
            case ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY_VALUE:
                return "Request failed because client is not running identd (or not reachable from the server)";
            case ERROR_CODE_TYPE_LEAGUE_SAME_NAME_VALUE:
                return "Request failed because client's identd could not confirm the user ID string in the request";
            default:
                return "Unknown reply code";
        }
    }
}
