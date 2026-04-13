module.exports = {
  darkMode: 'class',
  content: [
    "./src/main/resources/templates/**/*.html",
    "./src/main/resources/static/**/*.js",
    "./src/main/resources/static/**/*.html",
    "./**/*.html"
  ],
  theme: {
    extend: {
      colors: {
        band: {
			100: '#ABE342',
			200: '#42E35A',
			300: '#67E342',
			400: '#E3E042'
		}
      }
    },
  },
  plugins: [],
}