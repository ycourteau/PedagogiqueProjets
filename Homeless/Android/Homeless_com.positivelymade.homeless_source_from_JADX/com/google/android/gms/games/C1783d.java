package com.google.android.gms.games;

import com.google.android.gms.common.api.Status;

public final class C1783d {
    public static Status m8394a(int i) {
        return new Status(i, C1783d.m8395b(i));
    }

    public static String m8395b(int i) {
        switch (i) {
            case 0:
                return "STATUS_OK";
            case 1:
                return "STATUS_INTERNAL_ERROR";
            case 2:
                return "STATUS_CLIENT_RECONNECT_REQUIRED";
            case 3:
                return "STATUS_NETWORK_ERROR_STALE_DATA";
            case 4:
                return "STATUS_NETWORK_ERROR_NO_DATA";
            case 5:
                return "STATUS_NETWORK_ERROR_OPERATION_DEFERRED";
            case 6:
                return "STATUS_NETWORK_ERROR_OPERATION_FAILED";
            case 7:
                return "STATUS_LICENSE_CHECK_FAILED";
            case 8:
                return "STATUS_APP_MISCONFIGURED";
            case 9:
                return "STATUS_GAME_NOT_FOUND";
            case 14:
                return "STATUS_INTERRUPTED";
            case 15:
                return "STATUS_TIMEOUT";
            case 500:
                return "STATUS_RESOLVE_STALE_OR_NO_DATA";
            case 1000:
                return "STATUS_AUTH_ERROR_HARD";
            case 1001:
                return "STATUS_AUTH_ERROR_USER_RECOVERABLE";
            case 1002:
                return "STATUS_AUTH_ERROR_UNREGISTERED_CLIENT_ID";
            case 1003:
                return "STATUS_AUTH_ERROR_API_ACCESS_DENIED";
            case 1500:
                return "STATUS_PLAYER_OOB_REQUIRED";
            case 2000:
                return "STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS";
            case 2001:
                return "STATUS_REQUEST_UPDATE_TOTAL_FAILURE";
            case 2002:
                return "STATUS_REQUEST_TOO_MANY_RECIPIENTS";
            case 3000:
                return "STATUS_ACHIEVEMENT_UNLOCK_FAILURE";
            case 3001:
                return "STATUS_ACHIEVEMENT_UNKNOWN";
            case 3002:
                return "STATUS_ACHIEVEMENT_NOT_INCREMENTAL";
            case 3003:
                return "STATUS_ACHIEVEMENT_UNLOCKED";
            case 4000:
                return "STATUS_SNAPSHOT_NOT_FOUND";
            case 4001:
                return "STATUS_SNAPSHOT_CREATION_FAILED";
            case 4002:
                return "STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE";
            case 4003:
                return "STATUS_SNAPSHOT_COMMIT_FAILED";
            case 4004:
                return "STATUS_SNAPSHOT_CONFLICT";
            case 4006:
                return "STATUS_SNAPSHOT_CONFLICT_MISSING";
            case 6000:
                return "STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED";
            case 6001:
                return "STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER";
            case 6002:
                return "STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE";
            case 6003:
                return "STATUS_MULTIPLAYER_DISABLED";
            case 6500:
                return "STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE";
            case 6501:
                return "STATUS_MATCH_ERROR_INACTIVE_MATCH";
            case 6503:
                return "STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION";
            case 6504:
                return "STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS";
            case 6505:
                return "STATUS_MATCH_ERROR_ALREADY_REMATCHED";
            case 6506:
                return "STATUS_MATCH_NOT_FOUND";
            case 6507:
                return "STATUS_MATCH_ERROR_LOCALLY_MODIFIED";
            case 7000:
                return "STATUS_REAL_TIME_CONNECTION_FAILED";
            case 7001:
                return "STATUS_REAL_TIME_MESSAGE_SEND_FAILED";
            case 7002:
                return "STATUS_INVALID_REAL_TIME_ROOM_ID";
            case 7003:
                return "STATUS_PARTICIPANT_NOT_CONNECTED";
            case 7004:
                return "STATUS_REAL_TIME_ROOM_NOT_JOINED";
            case 7005:
                return "STATUS_REAL_TIME_INACTIVE_ROOM";
            case 7006:
                return "STATUS_REAL_TIME_SERVICE_NOT_CONNECTED";
            case 7007:
                return "STATUS_OPERATION_IN_FLIGHT";
            case 8000:
                return "STATUS_MILESTONE_CLAIMED_PREVIOUSLY";
            case 8001:
                return "STATUS_MILESTONE_CLAIM_FAILED";
            case 8002:
                return "STATUS_QUEST_NO_LONGER_AVAILABLE";
            case 8003:
                return "STATUS_QUEST_NOT_STARTED";
            default:
                return String.format("Status code (%d) not found!", new Object[]{Integer.valueOf(i)});
        }
    }
}
