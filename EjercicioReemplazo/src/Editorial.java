
public class Editorial {

					
		private String nombre, telefono, direccion, email, cuit;
		
		
		public Editorial(String nombre, String telefono, String direccion, String email, String cuit) {
			super();
			this.nombre = nombre;
			this.telefono = telefono;
			this.direccion = direccion;
			this.email = email;
			this.cuit = cuit;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCuit() {
			return cuit;
		}

		public void setCuit(String cuit) {
			this.cuit = cuit;
		}
		
		@Override
		public String toString() {
			return "Editorial [nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", email="
					+ email + ", cuit=" + cuit + "]";
		}
		

	}
