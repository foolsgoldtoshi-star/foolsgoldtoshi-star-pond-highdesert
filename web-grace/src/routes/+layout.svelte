<script>
  import { page } from '$app/stores';
  import { onMount } from 'svelte';
  
  // Divine Grace theme toggle
  let darkMode = false;
  
  onMount(() => {
    darkMode = localStorage.getItem('theme') === 'dark';
    updateTheme();
  });
  
  function toggleTheme() {
    darkMode = !darkMode;
    localStorage.setItem('theme', darkMode ? 'dark' : 'light');
    updateTheme();
  }
  
  function updateTheme() {
    document.documentElement.classList.toggle('dark', darkMode);
  }
</script>

<div class="divine-grace-app">
  <header class="sacred-header">
    <nav class="main-navigation">
      <a href="/" class="home-link">🌙 Sacred Technology</a>
      <a href="/teachings" class="teachings-link">📚 Teachings</a>
      <a href="/about" class="about-link">🐲 Guardian Dragon PBC</a>
      <button on:click={toggleTheme} class="theme-toggle">
        {darkMode ? '☀️' : '🌙'}
      </button>
    </nav>
  </header>

  <main class="sacred-content">
    <slot />
  </main>

  <footer class="sacred-footer">
    <nav class="footer-navigation">
      <a href="/docs/en/README.md" class="docs-link">📚 Sacred Documentation</a>
      <span class="divine-grace">Built with Divine Grace through bb + ClojureScript + Svelte</span>
    </nav>
  </footer>
</div>

<style>
  :global(html) {
    --sage-green: #87A96B;
    --jade-aquamarine: #40826D;
    --warm-light: #FDF6E3;
    --warm-dark: #2D3748;
  }
  
  :global(html.dark) {
    --bg-primary: var(--warm-dark);
    --text-primary: var(--warm-light);
    --accent: var(--jade-aquamarine);
  }
  
  :global(html:not(.dark)) {
    --bg-primary: var(--warm-light);
    --text-primary: var(--warm-dark);
    --accent: var(--sage-green);
  }
  
  .divine-grace-app {
    min-height: 100vh;
    background: var(--bg-primary);
    color: var(--text-primary);
    font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', system-ui;
    line-height: 1.6;
  }
  
  .sacred-header {
    padding: 1rem 2rem;
    border-bottom: 1px solid var(--accent);
  }
  
  .main-navigation {
    display: flex;
    gap: 2rem;
    align-items: center;
    max-width: 1200px;
    margin: 0 auto;
  }
  
  .main-navigation a {
    text-decoration: none;
    color: var(--accent);
    font-weight: 500;
  }
  
  .theme-toggle {
    background: none;
    border: 1px solid var(--accent);
    color: var(--accent);
    padding: 0.5rem;
    border-radius: 0.25rem;
    cursor: pointer;
    margin-left: auto;
  }
  
  .sacred-content {
    max-width: 50ch;
    margin: 2rem auto;
    padding: 0 2rem;
  }
  
  .sacred-footer {
    margin-top: 4rem;
    padding: 2rem;
    border-top: 1px solid var(--accent);
    text-align: center;
  }
  
  .footer-navigation {
    display: flex;
    flex-direction: column;
    gap: 1rem;
    align-items: center;
  }
  
  .divine-grace {
    font-size: 0.875rem;
    opacity: 0.7;
  }
</style>
