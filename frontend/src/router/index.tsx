import {createBrowserRouter} from "react-router-dom";
import PageNotFound from "@/pages/PageNotFound.tsx";
import Home from "@/pages/Home";
import Personas from "@/pages/Personas";


export const router = createBrowserRouter([
    {path: "*", element: <PageNotFound/>},
    {path: "/", element: <Home/>},
    {path: "/personas", element: <Personas/>},
    //{path: "/altapersona", element: <AltaPersona/>},
]);