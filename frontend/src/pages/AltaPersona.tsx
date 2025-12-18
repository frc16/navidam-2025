import { useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';

export default function AltaPersona() {
    const navigate = useNavigate();

    const [formData, setFormData] = useState({
        nombre: '',
        email: ''
    });

    const [status, setStatus] = useState<'idle' | 'loading' | 'success' | 'error'>('idle');

    const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        });
    };

    const handleSubmit = async (e: React.FormEvent) => {
        e.preventDefault();
        setStatus('loading');

        try {
            const response = await fetch('http://localhost:8080/api/personas', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(formData)
            });

            if (!response.ok) {
                throw new Error('Error en la petición al servidor');
            }

            setStatus('success');

            setTimeout(() => {
                navigate('/personas');
            }, 1500);

        } catch (error) {
            console.error("Error al crear persona:", error);
            setStatus('error');
        }
    };

    return (
        <div className="min-h-screen bg-slate-950 text-white font-sans">
            {/* Fondo decorativo navideño */}
            <div className="fixed inset-0 -z-10">
                <div className="absolute inset-0 bg-[radial-gradient(1000px_700px_at_15%_10%,rgba(239,68,68,.22),transparent_60%),radial-gradient(900px_700px_at_85%_15%,rgba(255,255,255,.10),transparent_55%),linear-gradient(to_bottom,#020617,#0b1220)]"></div>
                <div className="absolute inset-0 opacity-50 bg-[radial-gradient(circle_at_20%_30%,rgba(255,255,255,.10)_0_2px,transparent_3px),radial-gradient(circle_at_60%_20%,rgba(255,255,255,.08)_0_2px,transparent_3px),radial-gradient(circle_at_80%_40%,rgba(255,255,255,.06)_0_2px,transparent_3px)] bg-[length:280px_280px]"></div>
            </div>


            {/* Contenido Principal */}
            <main className="max-w-3xl mx-auto px-4 py-10">
                <div className="rounded-[2rem] bg-white text-slate-900 shadow-2xl ring-1 ring-black/5 overflow-hidden relative">

                    {/* Barra de carga animada */}
                    {status === 'loading' && (
                        <div className="absolute top-0 left-0 w-full h-1 bg-slate-100 overflow-hidden">
                            <div className="h-full bg-red-500 animate-pulse w-full"></div>
                        </div>
                    )}

                    <div className="p-6 md:p-10">
                        <div className="flex items-start justify-between gap-4">
                            <div>
                                <h1 className="text-2xl font-black tracking-tight">➕ Alta de persona</h1>
                                <p className="text-slate-600 text-sm mt-1">Crea un destinatario para enviar postales navideñas.</p>
                            </div>
                        </div>

                        {/* Mensaje de Éxito */}
                        {status === 'success' && (
                            <div className="mt-4 p-4 rounded-2xl bg-green-50 text-green-700 border border-green-200 text-sm font-medium animate-fade-in">
                                ✅ ¡Persona guardada correctamente! Redirigiendo...
                            </div>
                        )}

                        {/* Mensaje de Error */}
                        {status === 'error' && (
                            <div className="mt-4 p-4 rounded-2xl bg-red-50 text-red-700 border border-red-200 text-sm font-medium animate-fade-in">
                                ❌ Error de conexión. Asegúrate de que el Backend está encendido.
                            </div>
                        )}

                        {/* Formulario */}
                        <form onSubmit={handleSubmit} className="mt-6 space-y-4">
                            <div className="grid md:grid-cols-2 gap-4">
                                <div>
                                    <label className="text-sm text-slate-700 font-medium ml-1">Nombre</label>
                                    <input
                                        required
                                        name="nombre"
                                        value={formData.nombre}
                                        onChange={handleChange}
                                        className="mt-1 w-full px-4 py-3 rounded-2xl bg-white border border-slate-200 outline-none focus:ring-2 focus:ring-red-300 focus:border-red-300 transition-all"
                                        placeholder="Ej: Ana"
                                    />
                                    <p className="text-xs text-slate-500 mt-1 ml-1">Nombre visible en la plataforma.</p>
                                </div>

                                <div>
                                    <label className="text-sm text-slate-700 font-medium ml-1">Email</label>
                                    <input
                                        type="email"
                                        required
                                        name="email"
                                        value={formData.email}
                                        onChange={handleChange}
                                        className="mt-1 w-full px-4 py-3 rounded-2xl bg-white border border-slate-200 outline-none focus:ring-2 focus:ring-red-300 focus:border-red-300 transition-all"
                                        placeholder="ana@email.com"
                                    />
                                    <p className="text-xs text-slate-500 mt-1 ml-1">Se usará para el envío final.</p>
                                </div>
                            </div>

                            <div className="rounded-2xl border border-slate-200 bg-slate-50 p-4">
                                <p className="text-sm font-semibold text-slate-800">Nota</p>
                                <p className="text-sm text-slate-600 mt-1">Asegúrate de que los datos son correctos antes de guardar.</p>
                            </div>

                            <div className="flex flex-wrap gap-2 pt-2">
                                <button
                                    type="submit"
                                    disabled={status === 'loading'}
                                    className={`px-5 py-3 rounded-2xl text-white font-extrabold transition-all shadow-lg shadow-red-500/20 
                    ${status === 'loading' ? 'bg-slate-400 cursor-not-allowed' : 'bg-red-600 hover:bg-red-700 hover:scale-105 active:scale-95'}`}
                                >
                                    {status === 'loading' ? 'Guardando...' : 'Guardar'}
                                </button>
                                <Link
                                    to="/personas"
                                    className="px-5 py-3 rounded-2xl bg-slate-100 hover:bg-slate-200 text-slate-700 font-semibold transition-colors border border-slate-200"
                                >
                                    Cancelar
                                </Link>
                            </div>
                        </form>
                    </div>
                </div>
            </main>

        </div>
    );
}