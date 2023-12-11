import axios from "axios";

const apiUser = {
    baseUrl: "http://localhost:5000",

    fetchUsers: () => {
        const url = apiUser.baseUrl + "/users"
        const promise = axios.get(url);
        return promise;
    }


};

export default apiUser;