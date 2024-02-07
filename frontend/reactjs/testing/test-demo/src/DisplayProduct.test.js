import axios from "axios";
import ReactDOM from "react-dom/client"
import DisplayProduct from "./DisplayProduct";
import { getByTestId, waitFor,act } from "@testing-library/react";

describe("Display Product Tests",()=>{
jest.mock("axios");

let container;
beforeEach(()=>{
container=document.createElement("div");
document.body.appendChild(container);
});

afterEach(()=>{
jest.clearAllMocks();    
container.remove();
container=null;
});

it("Render Test-Product successfully fetched",()=>{
const id=10, name="samsung";    
const response={data:{id,name}};    
axios.get.mockImplementation=()=>response;
act(()=>{
ReactDOM.createRoot(container).render(<DisplayProduct id={id}/>)
});

waitFor(()=>{
expect(getByTestId("productID")).toHaveTextContent(id)
expect(getByTestId("productName")).toHaveTextContent(name);
});

});



it("Render Test-Product NOT successfully fetched",()=>{
    const id=15;    
    const response={error:{message:"500 error"}};    
    axios.get.mockImplementation=()=>response;
    act(()=>{
    ReactDOM.createRoot(container).render(<DisplayProduct id={id}/>)
    });
    
    waitFor(()=>{
    expect(getByTestId("error")).toBeInTheDocument();
    });
    
    })
    
}








)