import { Component } from "react";

class ErrorHandling extends Component{

    constructor(props){
        super(props);
        this.state={hashError:false,error:undefined};
    }

    componentDidCatch(error, errorInfo){
           this.setState({hashError:true,error:error.message});
           console.log("error is ",error);
    }

    render(){
        if(this.state.hashError){
            return(
                <div>Sorry, Something went wrong {this.state.error} </div>
            )
        }

        return this.props.children;


    }
    

}

export default ErrorHandling;