import { Component } from "react";
import { Home } from "./home";
import { Career } from "./career";
import { Services } from "./service";
import { NavigationBar } from "./navigationBar";
import { BrowserRouter as Router, Route, Routes, Link } from "react-router-dom";


export function App() {


    return (
        <div>

            <Router>

               
                <div>
                    <NavigationBar/>
                    <div >
                        <div >
                            <Routes>
                                <Route path="/" element={<Home />} />
                                <Route path="/services" element={<Services />} />
                                <Route path="/career" element={<Career />} />
                            </Routes>
                        </div>
                    </div>
                </div>
            </Router>
        </div>)

}